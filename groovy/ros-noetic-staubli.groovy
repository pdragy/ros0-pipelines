node {
    git url: 'https://github.com/ros-industrial/staubli.git', branch: 'melodic-devel'
    registerROS('ros:noetic-desktop-full', [
        'libopenblas-dev',
        'ros-noetic-industrial-robot-client',
        'ros-noetic-moveit-core'
    ], [])
}
