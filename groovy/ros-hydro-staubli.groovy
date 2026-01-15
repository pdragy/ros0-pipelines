node {
    git url: 'https://github.com/ros-industrial/staubli.git', branch: 'hydro-devel'
    registerROS('ros_legacy:hydro-ros-precise', [
        'libopenblas-dev',
        'ros-hydro-moveit-core',
        'ros-hydro-tf-conversions'
    ], [])
}
