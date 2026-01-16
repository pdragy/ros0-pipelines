node {
    git url: 'https://github.com/Kawasaki-Robotics/khi_robot.git', branch: 'master'
    registerROS('ros:melodic-ros-base', [
        'libopenblas-dev',
        'ros-melodic-controller-manager',
        'ros-melodic-diagnostic-updater',
        'ros-melodic-joint-limits-interface',
        'ros-melodic-moveit-core',
        'ros-melodic-realtime-tools',
        'ros-melodic-tf-conversions',
        'ros-melodic-transmission-interface'
    ], [])
}
